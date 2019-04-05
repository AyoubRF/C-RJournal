import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {AdminComponent} from "./admin/admin.component";
import {ArticleListComponent} from './admin/admincomponent/articlecomponent/article-list/article-list.component';
import {ArticleDetailComponent} from "./admin/admincomponent/articlecomponent/article-detail/article-detail.component";
import {UsercomponentComponent} from "./admin/usercomponent/usercomponent.component";

const routes: Routes = [

  {
    path: 'users', component: UsercomponentComponent
  },

  {
    path: 'articles', component: ArticleListComponent
  },

  {
    path: 'article/:id', component: ArticleDetailComponent
  },

  {
    path: 'admin', component: AdminComponent,
  },

  {
    path: '', redirectTo: '/admin', pathMatch: 'full'
  },

  {
    path: '**', redirectTo: '/admin', pathMatch: 'full'
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
