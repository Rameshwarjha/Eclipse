import { Component, OnInit, Inject } from '@angular/core';
import { PlayerDetails } from '../PlayerDetails';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { Cplayer } from '../cplayer';
import { ActivatedRoute } from '@angular/router';
import { CplayerserviceService } from '../services/cplayerservice.service';
import { deserialize } from 'json-typescript-mapper';

@Component({
  selector: 'app-playerdetails',
  templateUrl: './playerdetails.component.html',
  styleUrls: ['./playerdetails.component.css']
})
export class PlayerdetailsComponent implements OnInit {

  playerDetails: PlayerDetails;
  pid: String;

  constructor(private cplayerService: CplayerserviceService
    , private routes: ActivatedRoute,
    public dialogRef: MatDialogRef<PlayerdetailsComponent>,
    @Inject(MAT_DIALOG_DATA) public cplayer: Cplayer) {
      this.pid = this.cplayer.pid;
     }

  ngOnInit() {

    this.cplayerService.getPlayerDetails(this.pid)
      .subscribe(data1 => {
        this.playerDetails = deserialize(PlayerDetails, data1);
        // this.playerDetails=JSON.parse(data1);
        // console.log(this.playerDetails);
        
      });
  }

  onNoClick(): void {
    this.dialogRef.close();
  }

}
