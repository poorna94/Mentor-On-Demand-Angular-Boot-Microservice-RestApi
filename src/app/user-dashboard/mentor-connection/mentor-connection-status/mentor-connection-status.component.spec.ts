import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MentorConnectionStatusComponent } from './mentor-connection-status.component';

describe('MentorConnectionStatusComponent', () => {
  let component: MentorConnectionStatusComponent;
  let fixture: ComponentFixture<MentorConnectionStatusComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MentorConnectionStatusComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MentorConnectionStatusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
