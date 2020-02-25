import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class InputService {

  private inputFileURL = '/assets/resources/input.txt';
  private httpClient: HttpClient;

  constructor(private http: HttpClient) {
    this.httpClient = http;
  }

  public getTextFromFile() {
    let promise = new Promise((resolve, reject) => {
      this.httpClient.get(this.inputFileURL, {responseType: 'text'})
        .toPromise()
        .then(
          res => {
            resolve(res);
          },
          msg => {
            alert('Ups! Input file not found.');
            reject('');
          }
        );
    });
    return promise;
  }

}
