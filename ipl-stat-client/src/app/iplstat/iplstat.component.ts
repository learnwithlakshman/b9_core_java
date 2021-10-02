import { TeamAmount } from './../common/teamamount.model';
import { IplstatService } from './iplstat.service';
import { Component, OnInit } from '@angular/core';
import { ChartReadyEvent, ChartSelectEvent, GoogleChartInterface } from 'ng2-google-charts';
@Component({
  selector: 'app-iplstat',
  templateUrl: './iplstat.component.html',
  styleUrls: ['./iplstat.component.css']
})
export class IplstatComponent implements OnInit {

  data:any=[];
  teamAmount:TeamAmount[]=[];
  constructor(private iplStatService:IplstatService) { }
  
  ngOnInit(): void {
      this.iplStatService.teamAmount().subscribe(res=>{
          this.teamAmount = res;
          this.drawPieChart();
      })
  }
  drawPieChart(){
      this.data.push(['Team','Amount']);
      this.teamAmount.forEach(ele=>{
          this.data.push([ele['teamName'],ele['totalAmount']]);
      })
     console.log(this.data);
    
  }
  public pieChart: GoogleChartInterface = {
    chartType: 'PieChart',
    dataTable: this.data,
    //firstRowIsData: true,
    options: {'title': 'Tasks','width':600,'height':400},
  };
 
  select(event:ChartSelectEvent){
    console.log(event.selectedRowFormattedValues[0]);
  }


}
