function urlCheck(){
    var value = document.querySelector(".input").value;
    if (value==null||value==""){
        alert("请输入地址")
        return false;
    }
    if(!value.startsWith("http"))
    {
        alert("请输入正确的http/https链接")
        return false;
    }
    return true
}