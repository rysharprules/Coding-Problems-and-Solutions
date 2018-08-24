function go(){
    var btn = document.createElement('button');
    var count = 0;
    btn.id = 'btn';
    btn.innerHTML = count;
    document.body.appendChild(btn);
    btn.addEventListener("click", function() {
        btn.innerHTML = ++count;
    });
}