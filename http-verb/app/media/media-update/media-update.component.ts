import { Component, OnInit } from '@angular/core';
import { Media } from 'src/app/model/meida.model';
import { MediaDataService } from 'src/app/services/media-data.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-media-update',
  templateUrl: './media-update.component.html',
  styleUrls: ['./media-update.component.css']
})
export class MediaUpdateComponent implements OnInit {

  mediaId : number;
  media : Media;


  constructor(public activatedroute:ActivatedRoute, public mediaservice:MediaDataService,public router:Router) { 

  this.activatedroute.params.subscribe((parameter) => this.mediaId = parameter["mediaId"]);
  }

ngOnInit() {
  
  this.mediaservice.getOneMedia(this.mediaId).subscribe((response:any) => this.media = response);
}



updatemedia(txtfile:HTMLInputElement, txtdescription:HTMLInputElement, txttag:HTMLInputElement):void{
  
  
  let media = new Media(txtfile.value, txtdescription.value, txttag.value);

  
  this.mediaservice.updateMedia(this.mediaId, media).subscribe(
    (response) => {
      console.log(response);
      
      this.router.navigate(['/media']);
    });
    
    
    txtfile.value = "";
    txtdescription.value = "";
    txttag.value = "";

    
}

}
  


