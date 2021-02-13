$("document").ready(function () {
    $("#value").keydown(function () {
        $("span").removeAttr("style");
    });

    $("#search").on("click", function () {
        $("span:contains('" + ($("#value").val()) + "')").css("text-shadow", "2px 2px pink").css("font-style", "italic");
    });

    $("p").children("span").mouseenter(function () {
        $(this).css("background-color", "bisque")
    });

    $("p").children("span").mouseleave(function () {
        $(this).removeAttr("style")
    });
});