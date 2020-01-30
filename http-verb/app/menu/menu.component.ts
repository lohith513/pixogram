import { Component, OnInit } from '@angular/core';
import { AuthenicationService } from '../services/authenication.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  constructor(public auth :AuthenicationService) { }

  ngOnInit() {
  }

}
