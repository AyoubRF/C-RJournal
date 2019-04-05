import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {MenuModule} from 'primeng/menu';
import {ButtonModule} from 'primeng/button';
import { HeaderComponent } from './header/header.component';
import {PanelModule} from 'primeng/panel';
import { AdminComponent } from './admin/admin.component';
import { UsercomponentComponent } from './admin/usercomponent/usercomponent.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {ToastModule} from 'primeng/toast';
import {TableModule} from 'primeng/table';
import { StoreModule } from '@ngrx/store';
import { NgZorroAntdModule, NZ_I18N, en_US } from 'ng-zorro-antd';
import { EffectAdminEffects } from './admin/store/effet/admin.effects';
import { FormsModule,ReactiveFormsModule  } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { registerLocaleData } from '@angular/common';
import { EffectsModule } from '@ngrx/effects';
import { StoreRouterConnectingModule } from '@ngrx/router-store';
import { appReducers } from './admin/store/reducer/app.reducer';
import en from '@angular/common/locales/en';
import { RightMenuComponent } from './admin/right-menu/right-menu.component';
import { ArticlecomponentComponent } from './admin/admincomponent/articlecomponent/articlecomponent.component';
// import { InMemoryWebApiModule } from "angular-in-memory-web-api";
import { DataService } from "./admin/admincomponent/articlecomponent/data.service";
import { ArticleListComponent } from './admin/admincomponent/articlecomponent/article-list/article-list.component';
import { ArticleDetailComponent } from './admin/admincomponent/articlecomponent/article-detail/article-detail.component';
import {DialogModule} from 'primeng/dialog';
import {environment} from "../environments/environment";
import {StoreDevtoolsModule} from "@ngrx/store-devtools";
import {UserService} from "./admin/service/user.service";






registerLocaleData(en);


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AdminComponent,
    UsercomponentComponent,
    RightMenuComponent,
    ArticlecomponentComponent,
    ArticleListComponent,
    ArticleDetailComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MenuModule,
    ButtonModule,
    PanelModule,
    BrowserAnimationsModule,
    ToastModule,
    TableModule,
    NgZorroAntdModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    StoreModule.forRoot(appReducers),
    EffectsModule.forRoot([EffectAdminEffects]),
    StoreRouterConnectingModule.forRoot({ stateKey: 'router' }),
    !environment.production ? StoreDevtoolsModule.instrument() : [],
    // InMemoryWebApiModule.forRoot(DataService),
    DialogModule

  ],
  providers: [{ provide: NZ_I18N, useValue: en_US },UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
