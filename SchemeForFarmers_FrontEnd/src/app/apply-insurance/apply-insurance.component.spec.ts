import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ApplyInsuranceComponent } from './apply-insurance.component';

describe('ApplyInsuranceComponent', () => {
  let component: ApplyInsuranceComponent;
  let fixture: ComponentFixture<ApplyInsuranceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ApplyInsuranceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ApplyInsuranceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
