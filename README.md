# MyOnTouch
討論 OnTouch 事件

先按Activity 空白處
02-13 16:42:06.432 5488-5488 E: Activity dispatchTouchEvent ACTION_DOWN
02-13 16:42:06.432 5488-5488 E: Activity onTouchEvent ACTION_DOWN
02-13 16:42:06.544 5488-5488 E: Activity dispatchTouchEvent ACTION_UP
02-13 16:42:06.544 5488-5488 E: Activity onTouchEvent ACTION_UP

再按TextView
02-13 16:42:28.717 5488-5488 E: Activity dispatchTouchEvent ACTION_DOWN
02-13 16:42:28.717 5488-5488 E: MyTextView dispatchTouchEvent ACTION_DOWN
02-13 16:42:28.717 5488-5488 E: Activity onTouchEvent ACTION_DOWN
02-13 16:42:28.717 5488-5488 E: MyTextView onTouchEvent ACTION_DOWN
02-13 16:42:28.813 5488-5488 E: Activity dispatchTouchEvent ACTION_UP
02-13 16:42:28.813 5488-5488 E: MyTextView dispatchTouchEvent ACTION_UP
02-13 16:42:28.813 5488-5488 E: Activity ßonTouchEvent ACTION_UP
02-13 16:42:28.813 5488-5488 E: MyTextView onTouchEvent ACTION_UP
02-13 16:42:28.814 5488-5488 E: Activity on Click


觸控事件是由dispatchTouchEvent 發動的，如果不進行人為干擾（執行預設的 super.dispatchTouchEvent(event)），
則是件由外層網內層傳遞，傳遞至最內層的view時，就由onTouchEvent 處理，如果該方法曾處理該事件，則傳回true．
否則傳回false.此時事件往外層傳遞，由外層view的onTouch 處理

View 的事件是先執行onTouch 在執行」onClick,如果onTouch 傳回true,則事件不會再往下傳遞，也部會執行onClick
