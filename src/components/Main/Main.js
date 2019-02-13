import React from 'react';
import PropTypes from 'prop-types';
import classNames from 'classnames';
import { withStyles } from '@material-ui/core/styles';
import CssBaseline from '@material-ui/core/CssBaseline';
import Typography from '@material-ui/core/Typography';
import AppBar from '../AppBar/AppBar';
import Drawer from '../Drawer/Drawer';
import style from './Main.style';

class Main extends React.Component {

  static propTypes = {
    classes: PropTypes.object.isRequired,
    theme: PropTypes.object.isRequired,
  };

  state = {
    open: false,
  };

  handleDrawerOpen = () => {
    this.setState({ open: true });
  };

  handleDrawerClose = () => {
    this.setState({ open: false });
  };

  render() {
    const { classes } = this.props;
    const { open } = this.state;

    return (
      <div className={classes.root}>
        <CssBaseline />
        <Drawer onHandleClick={this.handleDrawerClose}
          open={open}/>
        <div className={classNames(classes.mainArea, {
            [classes.mainAreaShift]: open,
          })}>
          <AppBar onSideButtonClick={this.handleDrawerOpen}
            open={open}/>
          <div className={classes.content}>
            <Typography paragraph>
              Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor
              incididunt ut labore et dolore magna aliqua. Rhoncus dolor purus non enim praesent
              elementum facilisis leo vel. Risus at ultrices mi tempus imperdiet. Semper risus in
              hendrerit gravida rutrum quisque non tellus. Convallis convallis tellus id interdum
              velit laoreet id donec ultrices. Odio morbi quis commodo odio aenean sed adipiscing.
              Amet nisl suscipit adipiscing bibendum est ultricies integer quis. Cursus euismod quis
              viverra nibh cras. Metus vulputate eu scelerisque felis imperdiet proin fermentum leo.
              Mauris commodo quis imperdiet massa tincidunt. Cras tincidunt lobortis feugiat vivamus
              at augue. At augue eget arcu dictum varius duis at consectetur lorem. Velit sed
              ullamcorper morbi tincidunt. Lorem donec massa sapien faucibus et molestie ac.
            </Typography>
            <Typography paragraph>
              Consequat mauris nunc congue nisi vitae suscipit. Fringilla est ullamcorper eget nulla
              facilisi etiam dignissim diam. Pulvinar elementum integer enim neque volutpat ac
              tincidunt. Ornare suspendisse sed nisi lacus sed viverra tellus. Purus sit amet volutpat
              consequat mauris. Elementum eu facilisis sed odio morbi. Euismod lacinia at quis risus
              sed vulputate odio. Morbi tincidunt ornare massa eget egestas purus viverra accumsan in.
              In hendrerit gravida rutrum quisque non tellus orci ac. Pellentesque nec nam aliquam sem
              et tortor. Habitant morbi tristique senectus et. Adipiscing elit duis tristique
              sollicitudin nibh sit. Ornare aenean euismod elementum nisi quis eleifend. Commodo
              viverra maecenas accumsan lacus vel facilisis. Nulla posuere sollicitudin aliquam
              ultrices sagittis orci a.
            </Typography>
          </div>
        </div>
      </div>
    );
  }
}

export default withStyles(style, { withTheme: true })(Main);