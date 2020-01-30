import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { SearchresultComponent } from './searchresult/searchresult.component';

import { AuthGuardService } from './services/auth-guard.service';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { ErrorComponent } from './error/error.component';
import { MediaListComponent } from './media/media-list/media-list.component';
import { MediaAddComponent } from './media/media-add/media-add.component';
import { MediaUpdateComponent } from './media/media-update/media-update.component';



  const routes: Routes = [
    // Route object
  { path:"", redirectTo : "home", pathMatch: "full"},
    { path:"home", component: HomeComponent},
    { path:"contactus", component: ContactComponent},
    { path:"aboutus", component: AboutComponent},
    {path :"login",component:LoginComponent},
    { path:"media", component: MediaListComponent },
    { path:"media-add", component: MediaAddComponent, canActivate : [AuthGuardService]},
    { path:"media-update/:mediaId", component: MediaUpdateComponent, canActivate : [AuthGuardService]},

    { path:"logout", component: LogoutComponent, canActivate : [AuthGuardService]},
    // <url>/:<name by which data is accessed>
    { path:"search/:searchText", component: SearchresultComponent},

    // add a fallback mapping
    { path:"**", component: ErrorComponent}

    
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
