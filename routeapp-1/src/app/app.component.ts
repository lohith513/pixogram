import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenicationService } from './services/authenication.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'route-base-app';
  constructor(private router : Router,public auth :AuthenicationService){

  }
  searchcall(srch:HTMLInputElement){
    if(srch.value != ""){
      this.router.navigate(['/search/' + srch.value]); //  connect data
    }
  }
}