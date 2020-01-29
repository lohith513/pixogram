import { Component, OnInit,EventEmitter, Output } from '@angular/core';
import { Product } from '../model/product.model';


@Component({
  selector: 'app-productentry',
  templateUrl: './productentry.component.html',
  styleUrls: ['./productentry.component.css']
})
export class ProductentryComponent implements OnInit {

  @Output()
  submit_info : EventEmitter<Product>;


  constructor() { 

    this.submit_info = new EventEmitter();
  }

  ngOnInit() {
  }
  saveProduct(txtName:HTMLInputElement, txtCategory:HTMLInputElement, txtCost:HTMLInputElement):void{
    // create a new Product Object from coming values 
    let product = new Product(txtName.value, txtCategory.value, parseInt(txtCost.value));
   
    // send product object to Product-base component
    // by invocking an event
    this.submit_info.emit(product);

    // reset the form
    txtName.value = "";
    txtCategory.value = "";
    txtCost.value = "";
}
}
