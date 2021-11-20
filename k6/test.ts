import http from 'k6/http';
import { sleep } from 'k6';

export const options = {
  duration: '1m',
  vus: 50,
  thresholds: {
    http_req_duration: ['p(95)<500'],
  },
};

export default function () {
  const res = http.get('http://githubaction-terraform-example-2141246354.ap-south-1.elb.amazonaws.com');
  sleep(1);
}