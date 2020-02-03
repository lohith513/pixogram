import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthenicationService {

  constructor() { }

authenticate(userid : string, password : string): boolean{
    console.log("authentication recieved");
  if(userid === "lohith" && password === "123"){
    

    sessionStorage.setItem("user", userid);
    return true;
  }else{
    return false;
  }
}


isUserLoggedIn(): boolean{
  
  let user = sessionStorage.getItem('user');
  if(user == null)
    return false;
  return true;  
}


logout(){
  
  sessionStorage.removeItem('user');
  
}


getUserDetails():string{
  let user = sessionStorage.getItem('user');
  return user;
}
}
