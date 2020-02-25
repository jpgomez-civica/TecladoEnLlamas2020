import { Component, OnInit } from '@angular/core';
import { InputService } from './services/input.service';
import { Present } from './models/present';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  
  public area: number = 0;
  public areaRibbon: number = 0;

  constructor(private inputServ: InputService){

  }

  ngOnInit() {

    this.inputServ.getTextFromFile().then((value: string) => {

      const presents = new Array<Present>();
      const rows = value.split("\n");
      
      for (let i = 0; i < rows.length; i = i + 1) {
        const row = rows[i].split("x");

        if (row.length === 3) {
          if (+row[0] > 0 && +row[1] > 0 && +row[2] > 0) {
            const present = new Present(+row[0], +row[1], +row[2]);
            presents.push(present);
            this.area += present.getArea();
            this.areaRibbon += present.getAreaRibbon();
          }
        }
      }

    }).catch(function(err) { });

  }

}
