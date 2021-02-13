$(function(){
    $("img").hide();
    $("#button1").click(function(){
    var text=$('#id').val()
    $("#para").append(text+"<br>");
    })   
    $("#para").click(function(){
        $(this).hide();
        $("img").show();
    })
})