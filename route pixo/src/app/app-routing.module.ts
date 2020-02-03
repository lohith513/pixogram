import { NgModule,Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './authorization/login/login.component';
import { RegisterComponent } from './authorization/register/register.component';
import { SingleComponent } from './uploadmedia/single/single.component';
import { GallaryComponent } from './media/gallary/gallary.component';
import { MultipleComponent } from './uploadmedia/multiple/multiple.component';
import { FollowersComponent } from './followers/followers.component';
import { AccountUpdateComponent } from './accountdetails/account-update/account-update.component';
import { NewsfeedComponent } from './accountdetails/newsfeed/newsfeed.component';
import { LogoutComponent } from './accountdetails/logout/logout.component';
import { AuthGuardService } from './services/auth-guard.service';


const routes: Routes = [

  { path:"  ",redirectTo: '/login' , pathMatch: "full"},
  { path: 'login', component:LoginComponent },
  { path: 'register', component:RegisterComponent },
  { path: 'upload', component:SingleComponent , canActivate:[AuthGuardService] },
  { path: 'media', component:GallaryComponent },
  { path: 'multiple', component:MultipleComponent },
  { path: 'followers', component:FollowersComponent ,canActivate:[AuthGuardService]},
  { path: 'account', component:AccountUpdateComponent },
  { path: 'newsfeed', component:NewsfeedComponent },
  { path: 'logout', component:LogoutComponent }
  


  




];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
