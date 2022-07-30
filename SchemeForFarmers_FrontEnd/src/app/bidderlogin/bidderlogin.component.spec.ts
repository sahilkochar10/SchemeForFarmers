import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BidderloginComponent } from './bidderlogin.component';

describe('BidderloginComponent', () => {
  let component: BidderloginComponent;
  let fixture: ComponentFixture<BidderloginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BidderloginComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BidderloginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
