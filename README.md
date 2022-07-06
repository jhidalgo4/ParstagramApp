# Parstagram (social media app)


## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='https://media.giphy.com/media/VFtUDXJWKI3RtZefcn/giphy.gif' />

<img src='https://media.giphy.com/media/mAi3dNSYVJHdlyaeDZ/giphy.gif' />

## Video Walkthrough pt. 2

<img src='https://media.giphy.com/media/op3Dwx5eDMujX0VGqg/giphy.gif' />

<img src='https://media.giphy.com/media/sKYXE4EhlyZYCmNwnN/giphy.gif' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).


Time spent: **12** hours spent in total

## User Stories - functionality

- [x] User can sign up to create a new account using Parse authentication.
- [x] User can log in and log out of his or her account.
- [x] The current signed in user is persisted across app restarts.
- [x] User can take a photo, add a caption, and post it to "Instagram".

- [x] User can view the last 20 posts submitted to "Instagram".
- [x] The user should switch between different tabs - viewing all posts (feed view), compose (capture photos form camera) and profile tabs (posts made) using fragments and a Bottom Navigation View. (2 points)
- [x] User can pull to refresh the last 20 posts submitted to "Instagram".


## Notes

Android mobile app is a photo sharing app similar to Instagram but using Parse as its backend database. While creating the backend database for app on the web, I had to try twice in linking the API database from the web to my app. Creating a new project in (back4app.com) worked the second time around.

## Open-source libraries used

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

## License

    Copyright [2020] [Joaquin Hidalgo]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
