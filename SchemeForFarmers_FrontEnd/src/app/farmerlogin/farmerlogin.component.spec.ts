import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FarmerloginComponent } from './farmerlogin.component';

describe('FarmerloginComponent', () => {
  let component: FarmerloginComponent;
  let fixture: ComponentFixture<FarmerloginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FarmerloginComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FarmerloginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
