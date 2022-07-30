import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BidderDetailsComponent } from './bidder-details.component';

describe('BidderDetailsComponent', () => {
  let component: BidderDetailsComponent;
  let fixture: ComponentFixture<BidderDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BidderDetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BidderDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
