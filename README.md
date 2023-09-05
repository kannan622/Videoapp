![demo](https://github.com/nihk/youtube-shorts/blob/main/demo.gif)

It's pretty straightforward to get started using ExoPlayer by following the library's [Hello world!](https://exoplayer.dev/hello-world.html) documentation. Once you throw Android's lifecycles and state management into the mix, however, things quickly get more complex. It's easy to accidentally leak memory and hard to coordinate things in a way that's efficient and looks good in the UI. And that's just for playback of videos on a simple screen! Combining ExoPlayer with a `ViewPager` or `RecyclerView` adds a whole 'nother layer of complexity.

With this repository I wanted to demonstrate a small app showing how to do Instagram/YouTube Shorts/TikTok style video paging in a way that reconciles Android lifecycles and state management.

The approach I took is to reuse the same `ExoPlayer` and `PlayerView` instance for all pages. The `ExoPlayer` instance lives in and is managed by `MainViewModel`, and a singular `PlayerView` gets attached to whichever `ViewHolder` is active on the current page. Having only one `PlayerView` makes for a lot less state management.

I've been a bit more verbose with comments than I typically would in this repository, for the purposes of clarity. For testability I've added abstractions that wrap a few ExoPlayer APIs. I've also used an MVI architecture; this increases boilerplate but greatly minimizes state management.

This repository includes examples of streaming videos over the network (from Reddit /r/tiktokcringe) and local assets. It can be modified to handle video data coming from **any** data source.
