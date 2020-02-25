import { Component } from '@angular/core';
import { InputService } from './services/input.service';
import {Md5} from "md5-typescript";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

  public results :any;

  constructor(private inputServ: InputService){

  }

  ngOnInit() {

    this.inputServ.getTextFromFile().then((value: string) => {
      
      this.results = {
        firstNumberWithFiveZeros: this.getMd5HashNumberWithZerosInARow(value, 5),
        firstNumberWithSixZeros: this.getMd5HashNumberWithZerosInARow(value, 6)
      }

    });
  
  }

  public getMd5HashNumberWithZerosInARow (prefix: string, numberOfZeros: number = 1) :number {
    let isFound :boolean = false;

      let cont :number = 0;
      let zerosString :string = "";
      
      for (let i = 0; i < numberOfZeros; i = i + 1) {
        zerosString = zerosString.concat("0");
      }

      while (!isFound) {
        if (Md5.init(prefix.concat(cont.toString())).substr(0,numberOfZeros) === zerosString) {
          isFound = true;
          return cont;
        }
        cont = cont + 1;
      }
  }

}
