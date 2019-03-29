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
import { NgZorroAntdModule, NZ_I18N, en_US } from 'ng-zorro-antd';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { registerLocaleData } from '@angular/common';
import en from '@angular/common/locales/en';
import { RightMenuComponent } from './admin/right-menu/right-menu.component';


registerLocaleData(en);


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AdminComponent,
    UsercomponentComponent,
    RightMenuComponent
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
    HttpClientModule
  ],
  providers: [{ provide: NZ_I18N, useValue: en_US }],
  bootstrap: [AppComponent]
})
export class AppModule { }
