import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BidderRegComponent } from './bidder-reg.component';

describe('BidderRegComponent', () => {
  let component: BidderRegComponent;
  let fixture: ComponentFixture<BidderRegComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BidderRegComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BidderRegComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
