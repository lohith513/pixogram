import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GallaryComponent } from './media/gallary/gallary.component';
import { MediaUpdateComponent } from './media/media-update/media-update.component';
import { SingleComponent } from './uploadmedia/single/single.component';
import { MultipleComponent } from './uploadmedia/multiple/multiple.component';
import { LoginComponent } from './authorization/login/login.component';
import { RegisterComponent } from './authorization/register/register.component';
import { FollowersComponent } from './followers/followers.component';
import { AccountUpdateComponent } from './accountdetails/account-update/account-update.component';
import { BlockedUsersComponent } from './accountdetails/blocked-users/blocked-users.component';
import { LogoutComponent } from './accountdetails/logout/logout.component';
import { NewsfeedComponent } from './accountdetails/newsfeed/newsfeed.component';
import { NavComponent } from './menu/nav/nav.component';
import { NavbarComponent } from './menu/navbar/navbar.component';

@NgModule({
  declarations: [
    AppComponent,
    GallaryComponent,
    MediaUpdateComponent,
    SingleComponent,
    MultipleComponent,
    LoginComponent,
    RegisterComponent,
    FollowersComponent,
    AccountUpdateComponent,
    BlockedUsersComponent,
    LogoutComponent,
    NewsfeedComponent,
    NavComponent,
    NavbarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
