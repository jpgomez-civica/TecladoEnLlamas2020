import { Component, OnInit } from '@angular/core';
import { InputService } from './input.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {

  title = 'day-one-app';
  numFloor: number = 0;
  position: number = 0;

  constructor(private calculateServ: InputService) {
  }
  
  ngOnInit() {
    this.getNumFloor();
  }

  public getNumFloor() {

    let text = '';

    let countPositive = 0;
    let countNegative = 0;

    this.numFloor = 0;

    this.calculateServ.getTextFromFile().then((value: string) => {

      text = value;
      for (let i = 0; i < text.length; i = i + 1) {
        if (text[i] === '(') {
          countPositive = countPositive + 1;
        } else if (text[i] === ')') {
          countNegative = countNegative + 1;
        }

        if (countPositive - countNegative === -1 && this.position === 0) {
          this.position = i+1;
        }

      }

      this.numFloor = countPositive - countNegative;

    }).catch(function(err) { });
      
  }
  
}
