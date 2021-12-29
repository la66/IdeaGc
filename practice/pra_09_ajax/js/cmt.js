function getCommentList(){
    $.ajax({
        method:'get',
        url:'http://www.liulongbin.top:3006/api/cmtlist',
        data:{},
        success:function(res){
            // console.log(res)
            if(res.status!==200) return alert('获取数据成功')
            var rows=[]
            $.each(res.data,function(i,item){
            var str ='<li class="list-group-item">\n' +
                '        <span class="badge" style="background-color: #f0ad4e">平论时间:'+item.item+'</span>\n' +
                '        <span class="badge" style="background-color: #5bc0de">评论人:'+item.username+'</span>\n' +
                '        \n' +item.content+
                '    </li>'
                rows.push(str)
            })
            $('#cmt-list').empty().append(rows.join(''))
        }
    })
}

getCommentList()//调用函数
$(function(){
    $('#formAddCmt').submit(function(e){
        e.preventDefault()
        var data=$(this).serialize()
        $.post('http://www.liulongbin.top:3006/api/addcmt',data,
        function(res){
            if(res.status!==201){
                return alert('发表平论失败')
            }
            getCommentList()
            $('#formAddCmt')[0].reset()
        })
    })
})