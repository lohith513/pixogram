import { Component, OnInit } from '@angular/core';
import { AuthenicationService } from 'src/app/services/authenication.service';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor(public auth : AuthenicationService) { }

  ngOnInit() {

    this.auth.logout();
  }

}
