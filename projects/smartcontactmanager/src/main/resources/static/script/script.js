const toggleSidebar=()=>{
    if($(".sidebar").is(":visible")){
        $(".sidebar").css("display", "none");
        $(".content").css("margin-left", "15px");
		$(".content #sidebarIcon").css("display", "inline-block");
		
    }else{
        $(".sidebar").css("display", "block");
        $(".content").css("margin-left", "20%");
		$(".content #sidebarIcon").css("display", "none");
    }
}; 