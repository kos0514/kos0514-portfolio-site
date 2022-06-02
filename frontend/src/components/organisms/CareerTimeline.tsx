import { Typography } from '@mui/material';
import Timeline from '@mui/lab/Timeline';
import { CareerTimelineItem } from '../molecules/index';

interface CareersData {
  yearmonth: string;
  careerdivision: string;
  careertitle: string;
  careercontent: string;
}

const createData = (
  yearmonth: string,
  careerdivision: string,
  careertitle: string,
  careercontent: string,
): CareersData => ({ yearmonth, careerdivision, careertitle, careercontent });

// 最終的に、下記のような値をDBから取得する予定。
const rows = [
  createData('2016', '1', 'タイトルテスト1', '内容1'),
  createData('2017', '2', 'タイトルテスト2', '内容2'),
  createData('2018', '2', 'タイトルテスト3', '内容3'),
  createData('2019', '2', 'タイトルテスト4', '内容4'),
  createData('2020', '2', 'タイトルテスト5', '内容5'),
  createData('2021', '3', 'タイトルテスト6', '内容6'),
  createData('2022', '4', 'タイトルテスト7', '内容7'),
];

const getCareerTimelineItem = () =>
  rows.map(({ yearmonth, careerdivision, careertitle, careercontent }) => (
    <CareerTimelineItem
      {...{
        key: yearmonth,
        yearmonth,
        careerdivision,
        careertitle,
        careercontent,
      }}
    />
  ));

// {TODO} DBからデータを取得する処理を記載する。
const CareerTimeline = () => (
  <>
    <Timeline>{getCareerTimelineItem()}</Timeline>
    <Typography color="textPrimary" gutterBottom variant="body1">
      ★ここに何かしら書いた方が良いかもしれません。timelineとの間隔空けて、中央揃え、画像を追加し、左画像・右文章のようなイメージ、ここも動的に変更可能にする。
    </Typography>
  </>
);

export default CareerTimeline;
