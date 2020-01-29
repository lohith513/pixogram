import { Component, OnInit, Input } from '@angular/core';
import { Product } from '../model/product.model';

@Component({
  selector: 'app-productlist',
  templateUrl: './productlist.component.html',
  styleUrls: ['./productlist.component.css']
})
export class ProductlistComponent implements OnInit {

  @Input()
  productsList : Array<Product>;

  constructor() { 

  }


  ngOnInit() {
  }

}
