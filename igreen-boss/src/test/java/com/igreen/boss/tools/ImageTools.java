package com.igreen.boss.tools;

import net.sourceforge.tess4j.Tesseract;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class ImageTools {
	
	public static int isBlack(int colorInt) {
		Color color = new Color(colorInt);
		//if (color.getRed() + color.getGreen() + color.getBlue() <= 100) {
		if (color.getRed() == 0 && color.getGreen() == 0 && color.getBlue() == 0) {
			return 1;
		}
		return 0;
	}

	public static int isWhite(int colorInt) {
		Color color = new Color(colorInt);
		if (color.getRed() + color.getGreen() + color.getBlue() > 100) {
			return 1;
		}
		return 0;
	}
	
	public static BufferedImage removeBlank(BufferedImage img) throws Exception {
		int width = img.getWidth();
		int height = img.getHeight();
		int start = 0;
		int end = 0;
		Label1: for (int y = 0; y < height; ++y) {
			int count = 0;
			for (int x = 0; x < width; ++x) {
				if (isWhite(img.getRGB(x, y)) == 1) {
					count++;
				}
				if (count >= 1) {
					start = y;
					break Label1;
				}
			}
		}
		Label2: for (int y = height - 1; y >= 0; --y) {
			int count = 0;
			for (int x = 0; x < width; ++x) {
				if (isWhite(img.getRGB(x, y)) == 1) {
					count++;
				}
				if (count >= 1) {
					end = y;
					break Label2;
				}
			}
		}
		return img.getSubimage(0, start, width, end - start + 1);
	}

	/**
	 * 去图片背景
	 * @param picFile
	 * @return
	 * @throws Exception
	*/

	public static BufferedImage removeBackgroud(String picFile)
			throws Exception {
		BufferedImage img = ImageIO.read(new File(picFile));
		//BufferedImage img =cleanImage(picFile);
		int width = img.getWidth();  
	    int height = img.getHeight();
		/*BufferedImage grayImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_BINARY);*/

		BufferedImage grayImage = ImageIO.read(new File(picFile));
		//BufferedImage grayImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_BINARY);
		for(int i= 0 ; i < width ; i++){
	        for(int j = 0 ; j < height; j++){  
				int rgb = img.getRGB(i, j);
				grayImage.setRGB(i, j, rgb);
				if (isBlack(img.getRGB(i, j)) == 1) {
					grayImage.setRGB(i, j, Color.WHITE.getRGB());
				}else {
					grayImage.setRGB(i, j, rgb);
				}
	        }  
	    } 
		//return reverse(grayImage);
		Tesseract instance = Tesseract.getInstance();
		System.out.println("grayImage==" + instance.doOCR(grayImage));
		System.out.println("cleanImage(grayImage)" + instance.doOCR(cleanImage(grayImage)));
		System.out.println("reverse(cleanImage(grayImage))==" + instance.doOCR(reverse(cleanImage(grayImage))));
		return reverse(cleanImage(grayImage));
	}

	/**
	 *
	 */
	public static BufferedImage cleanImage(BufferedImage bufferedImage) throws Exception {

		//BufferedImage bufferedImage = ImageIO.read(new File(picFile));
		int h = bufferedImage.getHeight();
		int w = bufferedImage.getWidth();

		// 灰度化
		int[][] gray = new int[w][h];
		for (int x = 0; x < w; x++){
			for (int y = 0; y < h; y++){
				int argb = bufferedImage.getRGB(x, y);
				// 图像加亮（调整亮度识别率非常高）
				int r = (int) (((argb >> 16) & 0xFF) * 1.1 + 30);
				int g = (int) (((argb >> 8) & 0xFF) * 1.1 + 30);
				int b = (int) (((argb >> 0) & 0xFF) * 1.1 + 30);
				if (r >= 255){
					r = 255;
				}
				if (g >= 255){
					g = 255;
				}
				if (b >= 255){
					b = 255;
				}
				gray[x][y] = (int) Math.pow((Math.pow(r, 2.2) * 0.2973 + Math.pow(g, 2.2)* 0.6274 + Math.pow(b, 2.2) * 0.0753), 1 / 2.2);
			}
		}

		// 二值化
		int threshold = ostu(gray, w, h);
		BufferedImage binaryBufferedImage = new BufferedImage(w, h,BufferedImage.TYPE_BYTE_BINARY);
		for (int x = 0; x < w; x++){
			for (int y = 0; y < h; y++){
				if (gray[x][y] > threshold){
					gray[x][y] |= 0x00FFFF;
				} else{
					gray[x][y] &= 0xFF0000;
				}
				binaryBufferedImage.setRGB(x, y, gray[x][y]);
			}
		}

		//去除干扰线条
		for(int y = 1; y < h-1; y++){
			for(int x = 1; x < w-1; x++){
				boolean flag = false ;
				if(isBlack1(binaryBufferedImage.getRGB(x, y))){
					int n = 0;
					//左右均为空时，去掉此点
					if(isWhite1(binaryBufferedImage.getRGB(x-1, y)) && isWhite1(binaryBufferedImage.getRGB(x+1, y))){
						n += 1;
					}
					//上下均为空时，去掉此点
					if(isWhite1(binaryBufferedImage.getRGB(x, y+1)) && isWhite1(binaryBufferedImage.getRGB(x, y-1))){
						n += 1;
					}
					//斜上下为空时，去掉此点
					if(isWhite1(binaryBufferedImage.getRGB(x-1, y+1)) && isWhite1(binaryBufferedImage.getRGB(x+1, y-1))){
						n += 1;
					}
					if(isWhite1(binaryBufferedImage.getRGB(x+1, y+1)) && isWhite1(binaryBufferedImage.getRGB(x-1, y-1))){
						n += 1;
					}
					if(n >= 2){
						binaryBufferedImage.setRGB(x,y,-1);
					}
				} else {
					int n = 0;
					//左右均为空时，去掉此点
					if(isBlack1(binaryBufferedImage.getRGB(x-1, y)) && isBlack1(binaryBufferedImage.getRGB(x+1, y))){
						n += 1;
					}
					//上下均为空时，去掉此点
					if(isBlack1(binaryBufferedImage.getRGB(x, y+1)) && isBlack1(binaryBufferedImage.getRGB(x, y-1))){
						n += 1;
					}
					//斜上下为空时，去掉此点
					if(isBlack1(binaryBufferedImage.getRGB(x-1, y+1)) && isBlack1(binaryBufferedImage.getRGB(x+1, y-1))){
						n += 1;
					}
					if(isBlack1(binaryBufferedImage.getRGB(x+1, y+1)) && isBlack1(binaryBufferedImage.getRGB(x-1, y-1))){
						n += 1;
					}
					if(n >= 2){
						binaryBufferedImage.setRGB(x,y,0);
					}
				}
			}
		}


		// 矩阵打印
		for (int y = 0; y < h; y++){
			for (int x = 0; x < w; x++){
				if (isBlack1(binaryBufferedImage.getRGB(x, y))){
					System.out.print("*");
				} else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		return binaryBufferedImage;
		//ImageIO.write(binaryBufferedImage, "jpg", new File(destDir, sfile.getName()));
	}

	public static boolean isWhite1(int colorInt)
	{
		Color color = new Color(colorInt);
		if (color.getRed() + color.getGreen() + color.getBlue() > 300)
		{
			return true;
		}
		return false;
	}

	public static boolean isBlack1(int colorInt){
		Color color = new Color(colorInt);
		if (color.getRed() + color.getGreen() + color.getBlue() <= 300){
			return true;
		}
		return false;
	}

	public static int ostu(int[][] gray, int w, int h){
		int[] histData = new int[w * h];
		// Calculate histogram
		for (int x = 0; x < w; x++){
			for (int y = 0; y < h; y++){
				int red = 0xFF & gray[x][y];
				histData[red]++;
			}
		}

		// Total number of pixels
		int total = w * h;

		float sum = 0;
		for (int t = 0; t < 256; t++)
			sum += t * histData[t];

		float sumB = 0;
		int wB = 0;
		int wF = 0;

		float varMax = 0;
		int threshold = 0;

		for (int t = 0; t < 256; t++){
			wB += histData[t]; // Weight Background
			if (wB == 0)
				continue;

			wF = total - wB; // Weight Foreground
			if (wF == 0)
				break;

			sumB += (float) (t * histData[t]);

			float mB = sumB / wB; // Mean Background
			float mF = (sum - sumB) / wF; // Mean Foreground

			// Calculate Between Class Variance
			float varBetween = (float) wB * (float) wF * (mB - mF) * (mB - mF);

			// Check if new maximum found
			if (varBetween > varMax){
				varMax = varBetween;
				threshold = t;
			}
		}

		return threshold;
	}






	/**
	 * 图像反色
	 * @return
	 * @throws Exception*/


	public static BufferedImage reverse(BufferedImage img)
			throws Exception {
		int width = img.getWidth();  
	    int height = img.getHeight();  
		BufferedImage reverseImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_BINARY);  
	    for(int i= 0 ; i < width ; i++){  
	        for(int j = 0 ; j < height; j++){  
	        int rgb = img.getRGB(i, j);  
	        Color col = new Color(rgb);
	        int r = col.getRed();
	        int g = col.getGreen();
	        int b = col.getBlue();
	        int r_ = 255-r;
	        int g_ = 255-g;
	        int b_ = 255-b;
	        Color newCol = new Color(r_,g_,b_);
	        reverseImage.setRGB(i, j, newCol.getRGB());  
	        }  
	    } 
		return reverseImage;
	}
/*
*
	 * 切割图片
	 * @param img
	 * @return
	 * @throws Exception*/


	public static List<BufferedImage> splitImage(BufferedImage img)
			throws Exception {
		List<BufferedImage> subImgs = new ArrayList<BufferedImage>();
		int width = img.getWidth();
		int height = img.getHeight();
		List<Integer> weightlist = new ArrayList<Integer>();
		for (int x = 0; x < width; ++x) {
			int count = 0;
			for (int y = 0; y < height; ++y) {
				if (isWhite(img.getRGB(x, y)) == 1) {
					count++;
				}
			}
			weightlist.add(count);
		}
		for (int i = 1; i < weightlist.size();i++) {
			if(weightlist.get(i-1)==0 && weightlist.get(i)>0){
				int j = i;
				while (weightlist.get(j++) > 0) {

				}
				subImgs.add(removeBlank(img.getSubimage(i-1, 0,
						j-i, height)));
			}
		}
		return subImgs;
	}
}
