import { Component, OnInit } from '@angular/core';
import { InputService } from './services/input.service';
import { House } from './models/house';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  
  public housesChallengeOne = new Array<House>();
  public houses = new Array<House>();
  public xPositionSantaChallengeOne :number = 0;
  public yPositionSantaChallengeOne :number = 0;
  public xPositionSanta :number = 0;
  public yPositionSanta :number = 0;
  public xPositionRoboSanta :number = 0;
  public yPositionRoboSanta :number = 0;
  
  constructor(private inputServ: InputService){

  }

  ngOnInit() {

    this.inputServ.getTextFromFile().then((value: string) => {
      
      this.houses = new Array<House>();
      this.housesChallengeOne = new Array<House>()
      const initialHouse = new House(this.xPositionSanta, this.yPositionSanta);
      initialHouse.numberOfPresents = initialHouse.numberOfPresents + 1;
      this.houses.push(initialHouse);
      this.housesChallengeOne.push(initialHouse);

      for (let i = 0; i < value.length; i = i + 1) {
        
        switch (value[i]) {

          case '^':
            this.yPositionSantaChallengeOne = this.yPositionSantaChallengeOne + 1;  
            if (i % 2 === 0) {
              this.yPositionSanta = this.yPositionSanta + 1;  
            } else {
              this.yPositionRoboSanta = this.yPositionRoboSanta + 1;
            }
          break;

          case '<':
            this.xPositionSantaChallengeOne = this.xPositionSantaChallengeOne - 1;  
            if (i % 2 === 0) {
              this.xPositionSanta = this.xPositionSanta - 1;
            } else {
              this.xPositionRoboSanta = this.xPositionRoboSanta - 1;
            }
          break;

          case '>':
            this.xPositionSantaChallengeOne = this.xPositionSantaChallengeOne + 1;  
            if (i % 2 === 0) {
              this.xPositionSanta = this.xPositionSanta + 1;
            } else {
              this.xPositionRoboSanta = this.xPositionRoboSanta + 1;
            }
          break;

          case 'v':
            this.yPositionSantaChallengeOne = this.yPositionSantaChallengeOne - 1;  
            if (i % 2 === 0) {
              this.yPositionSanta = this.yPositionSanta - 1;
            } else {
              this.yPositionRoboSanta = this.yPositionRoboSanta - 1;
            }
          break;

        }

        this.movePosition(this.xPositionSanta, this.yPositionSanta);
        this.movePosition(this.xPositionRoboSanta, this.yPositionRoboSanta);
        this.movePosition(this.xPositionSantaChallengeOne, this.yPositionSantaChallengeOne, true);
      }

    }).catch(function(err) { });

  }

  public movePosition(xPosition: number, yPosition: number, isChallengeOne :boolean = false) {
    if (isChallengeOne) {
      const filteredHouseChallengeOne = this.housesChallengeOne.filter( house => house.xPosition === xPosition 
        && house.yPosition === yPosition);
  
      if (filteredHouseChallengeOne.length !== 0) {
        filteredHouseChallengeOne[0].numberOfPresents = filteredHouseChallengeOne[0].numberOfPresents + 1;
      } else {
        const house = new House(xPosition, yPosition);
        this.housesChallengeOne.push(house);
      }
    } else {
      const filteredHouse = this.houses.filter( house => house.xPosition === xPosition 
        && house.yPosition === yPosition);
  
      if (filteredHouse.length !== 0) {
        filteredHouse[0].numberOfPresents = filteredHouse[0].numberOfPresents + 1;
      } else {
        const house = new House(xPosition, yPosition);
        this.houses.push(house);
      }
    }

  }

}
