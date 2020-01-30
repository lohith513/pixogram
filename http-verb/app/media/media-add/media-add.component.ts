import { Component, OnInit } from '@angular/core';
import { MediaDataService } from 'src/app/services/media-data.service';
import { Router } from '@angular/router';
import { Media } from 'src/app/model/meida.model';

@Component({
  selector: 'app-media-add',
  templateUrl: './media-add.component.html',
  styleUrls: ['./media-add.component.css']
})
export class MediaAddComponent implements OnInit {

  constructor(public mediaService: MediaDataService, public router : Router) { }

  ngOnInit() {
  }

  savemedia(txtfile:HTMLInputElement, txtdescription:HTMLInputElement, txttag:HTMLInputElement):void{
    
    let media = new Media(txtfile.value, txtdescription.value, txttag.value);

    
    this.mediaService.addNewMedia(media).subscribe(
      (response) => {
        console.log(response);
        
        this.router.navigate(['/media']);
      });


    
    txtfile.value = "";
    txtdescription.value = "";
    txttag.value = "";

    
}


}
