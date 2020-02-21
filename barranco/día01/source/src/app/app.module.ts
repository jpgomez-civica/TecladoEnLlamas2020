import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { InputService } from './input.service';
import { HttpClientModule, HttpClient } from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [
    InputService,
    HttpClient
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
