//简单动画函数封装obj目标对象 target 目标位置
function animate(obj,target,callback){
    clearInterval(obj.timer);
    obj.timer=setInterval(function(){//定时器不断操作
        //步长值写道里面 Math.ceil()往上取整
        var step=(target-obj.offsetLeft)/10;
        step=step > 0 ? Math.ceil(step):Math.floor(step);
        if(obj.offsetLeft==target){//停止动画 本质停止定时器
            clearInterval(obj.timer);
            //回调函数写到定时器结束里面
            if(callback){
                //调用函数
                callback();
            }
        }
        //把每次加1的步长改为一个减小的
        obj.style.left = obj.offsetLeft +step+ 'px';
    },100)
}