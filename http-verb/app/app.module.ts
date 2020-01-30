import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { MenuComponent } from './menu/menu.component';
import { ContactComponent } from './contact/contact.component';
import { SearchresultComponent } from './searchresult/searchresult.component';

import { ErrorComponent } from './error/error.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';

import { MediaAddComponent } from './media/media-add/media-add.component';
import { MediaListComponent } from './media/media-list/media-list.component';
import { MediaUpdateComponent } from './media/media-update/media-update.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutComponent,
    MenuComponent,
    ContactComponent,
    SearchresultComponent,
   
    ErrorComponent,
    LoginComponent,    
    LogoutComponent,
   
    MediaAddComponent,
    MediaListComponent,
    MediaUpdateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
