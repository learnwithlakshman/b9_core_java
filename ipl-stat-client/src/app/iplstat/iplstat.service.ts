import { TeamAmount } from './../common/teamamount.model';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class IplstatService {

  constructor(private http:HttpClient) { }

  teamAmount():Observable<TeamAmount[]>{
      return this.http.get<TeamAmount[]>('https://player-stat-serverapp.herokuapp.com/api/player/stat/teamamount');
  }
}
