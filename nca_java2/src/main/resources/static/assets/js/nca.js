function editBtn(msg){
	if(confirm(msg + 'しますよろしいですか')){
		return true;
	}
	return false;
}

//  id="view"を取得
let viewicon = document.getElementById('view');

//  id="password"を取得
let inputtype = document.getElementById('password');

//  id="view"クリック時の処理を設定
$('#view').on('click', function (event) {event.preventDefault(); 

       //  passwordからtextへ
       if(inputtype.type === 'password'){
              inputtype.type = 'text';
              viewicon.innerHTML = '<i class="far fa-eye"></i>';

        //  textからpasswordへ
        } else {
               inputtype.type = 'password';
               viewicon.innerHTML = '<i class="far fa-eye-slash"></i>';
        }
});
