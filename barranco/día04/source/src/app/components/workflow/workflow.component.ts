import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-workflow',
  templateUrl: './workflow.component.html',
  styleUrls: ['./workflow.component.scss']
})
export class WorkflowComponent implements OnInit {

  @Input() public solution: any;

  constructor() { }

  ngOnInit() {
  }

}
