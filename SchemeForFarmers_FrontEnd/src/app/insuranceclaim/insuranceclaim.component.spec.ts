import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InsuranceclaimComponent } from './insuranceclaim.component';

describe('InsuranceclaimComponent', () => {
  let component: InsuranceclaimComponent;
  let fixture: ComponentFixture<InsuranceclaimComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InsuranceclaimComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InsuranceclaimComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
