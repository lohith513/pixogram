import { Component, OnInit } from '@angular/core';
import { AuthenicationService } from 'src/app/services/authenication.service';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements OnInit {

  constructor(public auth :AuthenicationService) { }

  ngOnInit() {
  }

}
