import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-workflow',
  templateUrl: './workflow.component.html',
  styleUrls: ['./workflow.component.scss']
})
export class WorkflowComponent implements OnInit {

  @Input() public solutionChallengeOne: number = 0;
  @Input() public solutionChallengeTwo: number = 0;

  constructor() { }

  ngOnInit() {
  }

}
