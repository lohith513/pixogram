import { Component, OnInit } from '@angular/core';
import { Media } from 'src/app/model/meida.model';
import { MediaDataService } from 'src/app/services/media-data.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-media-list',
  templateUrl: './media-list.component.html',
  styleUrls: ['./media-list.component.css']
})
export class MediaListComponent implements OnInit {
 
   media:Array<Media>

  constructor(private mediaservice : MediaDataService,public router :Router) {
    
  }
  add(){
    
    this.router.navigate(['/media-add']);
  }

  update(id:number){
    
    this.router.navigate(['/media-update/' + id]);
  }

  delete(id:number){
    
    this.mediaservice.deleteMedia(id).subscribe((response) => {
        console.log(response);
        
        this.mediaservice.getAllmedia().subscribe((response:any) => this.media = response);
        
      
    });
  }



  ngOnInit() {
  
    this.mediaservice.getAllmedia().subscribe((response:any) => this.media = response);
  }


}
