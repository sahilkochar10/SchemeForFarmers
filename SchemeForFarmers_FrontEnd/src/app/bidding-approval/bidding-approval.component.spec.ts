import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BiddingApprovalComponent } from './bidding-approval.component';

describe('BiddingApprovalComponent', () => {
  let component: BiddingApprovalComponent;
  let fixture: ComponentFixture<BiddingApprovalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BiddingApprovalComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BiddingApprovalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
