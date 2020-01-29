import { Component, OnInit } from '@angular/core';
import { Product } from '../model/product.model';

@Component({
  selector: 'app-product-base',
  templateUrl: './productbase.component.html',
  styleUrls: ['./productbase.component.css']
})
export class ProductbaseComponent implements OnInit {

  products : Array<Product>;

  constructor() {

    this.products = [
      new Product("First","Books",100),
      new Product("Second","Electronics",500),
      new Product("Third","Games",300)
    ];
   }

  ngOnInit() {
  }

}
