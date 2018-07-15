// 回到顶部
$('.backTop').live('click',function(){
    $('html , body').animate({scrollTop: 0},'slow');
})

// tab切换
$('.searchHead li').live('hover',function(){
    var index = $(this).index();
    console.log(index)
    $(this).parents('#content').find('.tab').hide().eq(index).show();
    console.log($(this).parents('#content').find('.tabcontent'))
})