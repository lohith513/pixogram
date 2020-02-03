import { Component, OnInit } from '@angular/core';
import { AuthenicationService } from 'src/app/services/authenication.service';

import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  errorMessage:string;
  autherized:boolean

  
constructor(public auth : AuthenicationService, public router : Router) { 
    this.errorMessage = "Invalid Credentials!!!";
    this.autherized = true; 
  }
  checkLogin(txtLogin : HTMLInputElement, txtPass : HTMLInputElement){
    
    if(this.auth.authenticate(txtLogin.value, txtPass.value)){
      
        this.autherized = true;
        this.router.navigateByUrl('/media');
    }else{
        this.autherized = false;
    }
  }
  
  ngOnInit() {
  }

}
