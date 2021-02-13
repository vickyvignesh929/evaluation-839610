$(document).ready(function() {
    $("#box2").click(function() {
        $("#box2").toggleClass("color2")
    });
    $("#box1").click(function() {
        $("#box1").toggleClass("color1")
    });
    $("#box3").click(function() {
        $("#box3").toggleClass("color3")
    });
    $("#box4").click(function() {
        $("#box4").toggleClass("color4")
    });
   $("#submit").click(function() {
        $(".boxes").detach();
    });
});

